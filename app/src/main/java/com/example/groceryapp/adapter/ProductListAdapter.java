package com.example.groceryapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.groceryapp.ApiResponse.CatalogProduct;
import com.example.groceryapp.R;
import com.squareup.picasso.Picasso;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ProductViewHolder>{
    private Context context;
    private List<CatalogProduct> productList;
    int productCount = 1;

    public ProductListAdapter(Context context, List<CatalogProduct> productList) {
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.each_item_design, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductViewHolder holder, int position) {
        String imageName = productList.get(position).getProductImage();
        final String imgUrl = String.format("http://www.meenaclick.com/back_end/assets/product_images/%s",imageName);
        try {
            URL imageUrl  = new URL(imgUrl);
            //set image
            Picasso.get().load(""+imageUrl).into(holder.productImage);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        //set product name
        holder.productName.setText(productList.get(position).getProductName());

        String classType = "[ "+productList.get(position).getWeight()+" "+productList.get(position).getWeightClass()+" ]";
        //set class name
        holder.className.setText(classType);

        //set product price
        holder.productPrice.setText("\u09F3"+ productList.get(position).getPrice());

        //handle cart view
        //when click on add to bag
        holder.addToBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.addToBag.setVisibility(View.INVISIBLE);
                holder.cartRemove.setVisibility(View.VISIBLE);
                holder.productQuantity.setVisibility(View.VISIBLE);
            }
        });

        //when click on remove button
        holder.cartRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.addToBag.setVisibility(View.VISIBLE);
                holder.cartRemove.setVisibility(View.INVISIBLE);
                holder.productQuantity.setVisibility(View.INVISIBLE);
            }
        });

        //when click on add button
        holder.cartAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.addToBag.setVisibility(View.INVISIBLE);
                holder.cartSubtraction.setVisibility(View.VISIBLE);
                holder.cartRemove.setVisibility(View.INVISIBLE);
                holder.productQuantity.setVisibility(View.VISIBLE);

                //increment when click on add button
                productCount++;
                holder.productQuantity.setText(String.valueOf(productCount));
            }
        });

        //when click on sub button
        holder.cartSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //decrement when click on sub button
                productCount--;
                holder.productQuantity.setText(String.valueOf(productCount));
                if (productCount < 2){
                    holder.cartSubtraction.setVisibility(View.INVISIBLE);
                    holder.cartRemove.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage, cartAdd, cartRemove, cartSubtraction;
        TextView productName, className, productPrice, productQuantity, addToBag;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            productImage = itemView.findViewById(R.id.itemIV);
            productName = itemView.findViewById(R.id.nameTV);
            className = itemView.findViewById(R.id.classTV);
            productPrice = itemView.findViewById(R.id.priceTV);
            cartAdd = itemView.findViewById(R.id.cartAddIV);
            cartRemove = itemView.findViewById(R.id.cartRemoveIV);
            productQuantity = itemView.findViewById(R.id.TotalTV);
            addToBag = itemView.findViewById(R.id.addToTV);
            cartSubtraction = itemView.findViewById(R.id.cartSub);
        }
    }
}

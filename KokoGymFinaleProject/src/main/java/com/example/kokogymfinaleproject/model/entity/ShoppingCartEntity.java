package com.example.kokogymfinaleproject.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shopping_carts")
public class ShoppingCartEntity extends BaseEntity {

    @OneToMany(mappedBy = "shoppingCart")
    private List<CartItemEntity> cartItems;

    public ShoppingCartEntity() {
        this.cartItems = new ArrayList<>();
    }

    public List<CartItemEntity> cartItems() {
        return cartItems;
    }

    public ShoppingCartEntity setCartItems(List<CartItemEntity> cartItems) {
        this.cartItems = cartItems;
        return this;
    }
}

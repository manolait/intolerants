package com.istc.intolerants;

import java.util.List;

public class ListaPost {
    // Encapsulamiento de Posts
    private List<Post> items;

    public ListaPost(List<Post> items) {
        this.items = items;
    }

    public void setItems(List<Post> items) {
        this.items = items;
    }

    public List<Post> getItems() {
        return items;
    }
}

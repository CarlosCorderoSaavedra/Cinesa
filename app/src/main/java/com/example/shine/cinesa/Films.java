package com.example.shine.cinesa;

/**
 * Created by Shine on 14/12/2015.
 */
public class Films {
    private String name;
    private int idDrawable;

    public Films(String name, int idDrawable) {
        this.name = name;
        this.idDrawable = idDrawable;
    }

    public String getName() {
        return name;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return name.hashCode();
    }

    public static Films[] ITEMS = {
            new Films("Mad Max", R.drawable.img_21069),
            new Films("Mad Max", R.drawable.img_21069),
            new Films("Mad Max", R.drawable.img_21069),
            new Films("Mad Max", R.drawable.img_21069),
            new Films("Mad Max", R.drawable.img_21069),
    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return Coche
     */
    public static Films getItem(int id) {
        for (Films item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
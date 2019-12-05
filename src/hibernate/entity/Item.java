package hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name="item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id")
    private int id;

    @Column(name="item_nm")
    private String name;

    @Column(name="quantity")
    private int quantity;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   @JoinColumn(name = "item_type_id")
    private Item_type item_type;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "item_cat_id")
    private Item_cat item_cat;

    public Item(){}

    public Item(String name){this.name=name;}

    public Item(String name, int quantity, Item_cat item_cat, Item_type item_type)
    {this.name=name; this.quantity=quantity; this.item_cat=item_cat; this.item_type=item_type;}

    public String getName(){return name;}

    public void setName(String name){this.name=name;}

    public int getQuantity(){return quantity;}

    public void setQuantity(int quantity){this.quantity=quantity;}

    public Item_cat getItem_cat(){return item_cat;}

    public void setItem_cat(Item_cat item_cat){this.item_cat=item_cat;}

    public Item_type getItem_type(){return item_type;}

    public void setItem_type(Item_type item_type){this.item_type=item_type;}

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String toString(){return "Item: {"+this.id+", "+this.name+", "+this.quantity+", "+this.item_cat.getName()+", "+this.item_type.getName()+"}"; }
}

package hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name="item_type")
public class Item_type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_type_id")
    private int id;

    @Column(name="item_type_nm")
    private String name;

    public Item_type(){}

    public Item_type(String name){this.name=name;}

    public String getName(){return name;}

    public void setName(String name){this.name=name;}

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String toString(){return "Item Type: {"+this.id+", "+this.name+"}";}
}

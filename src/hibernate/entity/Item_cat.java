package hibernate.entity;

        import javax.persistence.*;

@Entity
@Table(name="item_cat")
public class Item_cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_cat_id")
    private int id;

    @Column(name="item_cat_nm")
    private String name;

    public Item_cat(){}

    public Item_cat(String name){this.name=name;}

    public String getName(){return name;}

    public void setName(String name){this.name=name;}

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String toString(){return "Category: {"+this.id+", "+this.name+"}";}

}

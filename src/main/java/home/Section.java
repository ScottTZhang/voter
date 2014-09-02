package home;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Section")
public class Section {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    private int status;
    /* getters & setters */
    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getStatus(){
        return status;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String desc){
        description = desc;
    }
    public void setStatus(int s){
        status = s;
    }
}

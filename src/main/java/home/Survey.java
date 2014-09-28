package home;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Survey")
public class Survey {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;
    private int status;
    private String holder;
    private long sectionId;
    /* getters & setters */
    public long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public int getStatus(){
        return status;
    }
    public String getHolder() {
        return holder;
    }
    public long getSectionId() {
        return sectionId;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setDescription(String desc){
        description = desc;
    }
    public void setStatus(int s){
        status = s;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public void setSectionId(long sectionId) {
        this.sectionId = sectionId;
    }
}

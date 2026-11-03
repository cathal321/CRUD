@Entity
@Table(name = "client")
public class Client {

@Id
@GeneratedValue
private Long id;

private String name;
private String email;

}

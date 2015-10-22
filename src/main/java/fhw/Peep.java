package fhw;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Named
@Data
@RequestScoped
public class Peep
{
    public Peep()
    {

    }

    @PostConstruct
    private void init()
    {
        System.out.println("I got structed...");
    }
    
    @NotNull(message = "you gotta have a name")
    private String name;

    @NotNull(message = "you gotta have a title")
    private String title;


    public void go()
    {
        System.out.println( " go pushed; name [" + name + "]; title [" + title + "]");
    }
}

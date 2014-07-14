package jp.example.views;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author ymorika
 */
@Named
@ViewScoped
public class IndexView implements Serializable {
    private static final long serialVersionUID = 1L;
    @Getter @Setter
    private List<Product> productList;

    /**
     * Creates a new instance of IndexView
     */
    public IndexView() {
    }
    
    @PostConstruct
    public void init() {
        this.productList = new ArrayList<>();
        this.productList.add(new Product("hoge", 1));
    }
    
    public String next() {
        return "index2.xhtml";
    }
}

package jp.example.views;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author ymorika
 */
@Data
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int id;

    public Product(String hoge, int i) {
        this.name = hoge;
        this.id = i;
    }
}

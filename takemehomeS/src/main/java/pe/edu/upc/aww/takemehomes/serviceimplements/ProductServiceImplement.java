package pe.edu.upc.aww.takemehomes.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.takemehomes.entities.Product;
import pe.edu.upc.aww.takemehomes.repositories.IProductRepository;
import pe.edu.upc.aww.takemehomes.serviceinterfaces.IProductService;

import java.util.List;

@Service
public class ProductServiceImplement implements IProductService {
    @Autowired
    private IProductRepository pR;
    @Override
    public void insert(Product product) {
        pR.save(product);
    }

    @Override
    public List<Product> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idProduct) {
        pR.deleteById(idProduct);
    }

    @Override
    public Product listId(int idProduct) {
        return pR.findById(idProduct).orElse(new Product());
    }

    @Override
    public List<Product> findByNameProduct(String nameProduct) {
        return pR.findByNameProduct( nameProduct);
    }

    @Override
    public List<String[]> counterProductsForUsers() {
        return pR.countProductsWithUsers();
    }

    @Override
    public List<String[]> showDescriptionPerOrder() {
        return pR.showDescriptionPerOrder();
    }

    @Override
    public List<String []>listPricesGreaterThan1000(){return pR.listPricesGreaterThan1000();}


}

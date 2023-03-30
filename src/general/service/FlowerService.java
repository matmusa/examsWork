package general.service;

import java.util.List;
import java.util.Map;

public interface FlowerService<T> {
    String addFlowers(List<T> t);
        

    List<T> getAllFlowers();
        

    List<T> getFlowersFinByColor(String color);
        

    Map<String, List<T>> groupingFlowersByColor();
        

    int getSumAllFlowers();
        

    List<T> getAllFlowersSortByPrice();

}

package general.service.impl;

import general.service.FlowerService;
import general.db.DataBasa;
import general.model.Rose;

import java.util.*;

public class RoseServiceImpl implements FlowerService {
    private List<Rose> roses;

    public RoseServiceImpl(List<Rose> roses) {
        this.roses = roses;
    }

    public List<Rose> getRoses() {
        return roses;
    }

    public void setRoses(List<Rose> roses) {
        this.roses = roses;
    }

    @Override
    public String toString() {
        return "RoseService{" +
                "roses=" + roses +
                '}';
    }



    @Override
    public String addFlowers(List t) {
     setRoses(t);
        return t.toString();
    }

    @Override
    public List getAllFlowers() {
        return roses;
    }

    @Override
    public List getFlowersFinByColor(String color) {
        List<Rose> roseList = roses.stream().filter(x -> x.getColor().equalsIgnoreCase(color)).toList();
        return roseList;

    }

    @Override
    public Map<String, List> groupingFlowersByColor() {
        String red = "red";
        Map<String, List> stringListMap = new HashMap<>();
        List<Rose> roseList = roses.stream().filter(x -> x.getColor().equalsIgnoreCase(red)).toList();
        stringListMap.put(red, roseList);
        return stringListMap;
    }

    @Override
    public int getSumAllFlowers() {
        int a = 0;
        for (int i = 0; i < roses.size(); i++) {
            a = a + roses.get(i).getPrice();



        }
        return a;

    }

    @Override
    public List getAllFlowersSortByPrice() {
        System.out.println("1-asc and 2-desc");
        int a = new Scanner(System.in).nextInt();
        if (a == 1) {
            List<Rose> list = roses.stream().sorted(Comparator.comparing(Rose::getPrice)).toList();
            return list;
        } else if (a == 2) {
            List<Rose> list = roses.stream().sorted(Comparator.comparing(Rose::getPrice).reversed()).toList();
            return list;
        }
        return null;
    }
}

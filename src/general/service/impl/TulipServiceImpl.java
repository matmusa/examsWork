package general.service.impl;

import general.db.DataBasa;
import general.model.Rose;
import general.model.Tulip;
import general.service.FlowerService;

import java.util.*;

public class TulipServiceImpl implements FlowerService {
    private List<Tulip> tulips;

    public TulipServiceImpl(List<Tulip> tulips) {
        this.tulips = tulips;
    }

    public List<Tulip> getTulips() {
        return tulips;
    }

    public void setTulips(List<Tulip> tulips) {
        this.tulips = tulips;
    }

    @Override
    public String toString() {
        return "TulipService{" +
                "tulips=" + tulips +
                '}';
    }


    @Override
    public String addFlowers(List t) {
        setTulips(t);
        return t.toString();
    }

    @Override
    public List getAllFlowers() {
        return tulips;
    }

    @Override
    public List getFlowersFinByColor(String color) {
        List<Tulip> roseList = tulips.stream().filter(x -> x.getColor().equalsIgnoreCase(color)).toList();
        return roseList;
    }

    @Override
    public Map<String, List> groupingFlowersByColor() {
        String red = "Yellow";
        Map<String, List> stringListMap = new HashMap<>();
        List<Tulip> roseList = tulips.stream().filter(x -> x.getColor().equalsIgnoreCase(red)).toList();
        stringListMap.put(red, roseList);
        return stringListMap;
    }

    @Override
    public int getSumAllFlowers() {
        int a = 0;
        for (int i = 0; i < tulips.size(); i++) {
            a = a + tulips.get(i).getPrice();


        }
        return a;
    }

    @Override
    public List getAllFlowersSortByPrice() {
        System.out.println("1-asc and 2-desc");
        int a = new Scanner(System.in).nextInt();
        if (a == 1) {
            List<Tulip> list = tulips.stream().sorted(Comparator.comparing(Tulip::getPrice)).toList();
            return list;
        } else if (a == 2) {
            List<Tulip> list = tulips.stream().sorted(Comparator.comparing(Tulip::getPrice).reversed()).toList();
            return list;
        }
        return null;
    }
}

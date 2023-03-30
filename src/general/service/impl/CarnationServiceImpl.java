package general.service.impl;

import general.db.DataBasa;
import general.model.Carnation;
import general.model.Rose;
import general.service.FlowerService;

import java.io.File;
import java.util.*;

public class CarnationServiceImpl implements FlowerService {

    private List<Carnation>carnations;

    public CarnationServiceImpl() {
    }

    public CarnationServiceImpl(List<Carnation> carnations) {
        this.carnations = carnations;
    }

    public List<Carnation> getCarnations() {
        return carnations;
    }

    public void setCarnations(List<Carnation> carnations) {
        this.carnations = carnations;
    }

    @Override
    public String toString() {
        return "CarnationServiceImpl{" +
                "carnations=" + carnations +
                '}';
    }

    @Override
    public String addFlowers(List t) {
      setCarnations(t);
        return t.toString();
    }

    @Override
    public List getAllFlowers() {
        return carnations;
    }

    @Override
    public List getFlowersFinByColor(String color) {
        List<Carnation> roseList = carnations.stream().filter(x -> x.getColor().equalsIgnoreCase(color)).toList();
        return roseList;
    }

    @Override
    public Map<String, List> groupingFlowersByColor() {
        String red = "Yellow";
        Map<String, List> stringListMap = new HashMap<>();
        List<Carnation> roseList = carnations.stream().filter(x -> x.getColor().equalsIgnoreCase(red)).toList();
        stringListMap.put(red, roseList);
        return stringListMap;
    }

    @Override
    public int getSumAllFlowers() {
        int a = 0;
        for (int i = 0; i < carnations.size(); i++) {
            a  += carnations.get(i).getPrice();


        }
        return a;

    }

    @Override
    public List getAllFlowersSortByPrice() {
        System.out.println("1-asc and 2-desc");
        int a = new Scanner(System.in).nextInt();
        if (a == 1) {
            List<Carnation> list = carnations.stream().sorted(Comparator.comparing(Carnation::getPrice)).toList();
            return list;
        } else if (a == 2) {
            List<Carnation> list =  carnations.stream().sorted(Comparator.comparing(Carnation::getPrice).reversed()).toList();
            return list;
        }
        return null;
    }
}

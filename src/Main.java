import general.model.Carnation;
import general.model.Rose;
import general.model.Tulip;
import general.service.impl.CarnationServiceImpl;
import general.service.impl.RoseServiceImpl;
import general.service.impl.TulipServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Carnation carnation = new Carnation("Goland", 12, "Yellow", 400);
        Carnation carnation1 = new Carnation("Goland", 12, "Yellow", 420);
        Carnation carnation2 = new Carnation("Goland", 12, "Pirple", 500);

        Rose rose = new Rose("Germany", 34, "red", 500);
        Rose rose2 = new Rose("Germany", 34, "red", 320);
        Rose rose3 = new Rose("Germany", 34, "black", 1000);

        List<Rose> roseList = new ArrayList<>();
        roseList.add(rose);
        roseList.add(rose3);
        roseList.add(rose2);
        Tulip tulip = new Tulip("France ", 23, "yellow", 390);
        Tulip tulip2 = new Tulip("France ", 23, "red", 100);
        Tulip tulip3 = new Tulip("France ", 23, "yellow", 150);
        List<Tulip> tulips = new ArrayList<>();
        tulips.add(tulip);
        tulips.add(tulip2);
        tulips.add(tulip3);

        List<Carnation> carnations = new ArrayList<>();
        carnations.add(carnation1);
        carnations.add(carnation2);
        carnations.add(carnation);

        CarnationServiceImpl carnationService = new CarnationServiceImpl();
        System.out.println(carnationService.addFlowers(carnations));
        System.out.println(carnationService.getAllFlowers());
        System.out.println(carnationService.groupingFlowersByColor());
        System.out.println(carnationService.getAllFlowersSortByPrice());
        System.out.println(carnationService.getSumAllFlowers());
        carnationService.getFlowersFinByColor("yellow");

        RoseServiceImpl roseService = new RoseServiceImpl(roseList);
        System.out.println(roseService.addFlowers(roseList));
        System.out.println(roseService.getAllFlowers());
        System.out.println(roseService.getFlowersFinByColor("red"));
        System.out.println(roseService.getAllFlowersSortByPrice());
        System.out.println(roseService.getSumAllFlowers());
        System.out.println(roseService.groupingFlowersByColor());

        TulipServiceImpl tulipService = new TulipServiceImpl(tulips);
        System.out.println(tulipService.addFlowers(tulips));
        System.out.println(tulipService.getAllFlowers());
        System.out.println(tulipService.getAllFlowersSortByPrice());
        System.out.println(tulipService.groupingFlowersByColor());
        System.out.println(tulipService.getSumAllFlowers());
        System.out.println(tulipService.groupingFlowersByColor());


    }
}
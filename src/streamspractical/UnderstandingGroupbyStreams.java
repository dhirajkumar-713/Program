package streamspractical;

import java.util.*;
import java.util.stream.Collectors;

public class UnderstandingGroupbyStreams {
    public static void main(String[] args) {
        MaharashtraPopulation maharashtraPopulation=
                new MaharashtraPopulation(1,"Dhirajkumar","Jaiswal",3000);
        MaharashtraPopulation maharashtraPopulationOne=
                new MaharashtraPopulation(1,"Rameshchand","Jaiswal",3000);
        MaharashtraPopulation maharashtraPopulationTwo=
                new MaharashtraPopulation(1,"Vijaylaxmi","Jaiswal",3000);
        MaharashtraPopulation maharashtraPopulationThree=
                new MaharashtraPopulation(1,"Rajesh","Gupta",3000);
        MaharashtraPopulation maharashtraPopulationFour=
                new MaharashtraPopulation(1,"Ramu","Gupta",3000);

        List<MaharashtraPopulation> maharashtraPopulationList=new ArrayList<>();
        maharashtraPopulationList.add(maharashtraPopulation);
        maharashtraPopulationList.add(maharashtraPopulationOne);
        maharashtraPopulationList.add(maharashtraPopulationThree);
        maharashtraPopulationList.add(maharashtraPopulationTwo);
        maharashtraPopulationList.add(maharashtraPopulationFour);

        TreeMap<String, Set<String>> collect = maharashtraPopulationList.stream()
                .collect(Collectors.groupingBy(MaharashtraPopulation::getLastName,
                TreeMap::new,
                        Collectors.mapping(MaharashtraPopulation::getFirstName,
                                Collectors.toSet())));
        System.out.println(collect);
    }
}

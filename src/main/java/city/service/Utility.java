package city.service;
import salary.service.City;
import salary.service.Salary;

import java.util.ArrayList;
import java.util.List;
public class Utility {

    public List<Address> getAddressesByCity(City city, String cityName) {

        List<Address> addresses = new ArrayList<>();
        List<Address> cityAddresses = city.listAddresses();
        for (int i = 0; i < cityAddresses.size(); i++) {
            if (cityAddresses.get(i).city.equals(cityName)) {
                addresses.add(cityAddresses.get(i));
            }
        }
        return addresses;
    }

    public List<Integer> getSalariesOver(Salary salary, Integer filter) {
        List<Integer> salaries = new ArrayList<>();
        List<Integer> citySalaries = salary.returnSalaries();
        for (int i = 0; i < citySalaries.size(); i++) {
            if (citySalaries.get(i) > filter) {
                salaries.add(citySalaries.get(i));
            }
        }
        return salaries;
    }
}
package app;

import dto.Company;

/*
implementasi inner class
 */
public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Prastia corporation");
        System.out.println(company.getName());

        Company.Employee employee = company.new Employee();
        employee.setName("Agung");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

    }
}

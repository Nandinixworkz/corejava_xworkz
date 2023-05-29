package com.xworkz.companyapp;

public class CompanyTester {
    public static void main(String[] args) {
        Branch branch = new Branch();
        Company company = new Company(branch);
        company.branch.toRun();

    }
}

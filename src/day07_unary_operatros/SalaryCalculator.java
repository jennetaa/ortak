package day07_unary_operatros;

public class SalaryCalculator {

    public static void main(String[] args) {

//        declare and assign these variables:
//
//        salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
//
//        Sample date:
//        100000 (salary)
//        0.08 (state tax rate)
//        0.21 (federal tax rate)
//
//        Hint: use tax rates of 0.08 and 0.21 for 8% and 21%
//
//       Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes


        double Salary = 100_000f;
        double stateTaxRate = 0.08;
        // 8 %
        double federalTaxRate = 0.21; // 21 %
        double stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = Salary * stateTaxRate;
        federalTax = Salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = Salary - totalTax;

        String taxReport = "State tax rate: " + stateTaxRate + ", Federal tax rate: " + federalTaxRate + ", base salary: $" + Salary + "\nTax amount: " + stateTax + " for state tax and " + federalTax + " for federal tax, coming to a total of " + totalTax + "\nAfter tax your salary is " + salaryAfterTax;

        System.out.println(taxReport);

    }
}

package com.interface_segregation.examples.reports;

/***
 * Interface segregation principle says that larger interfaces should be split into smaller ones.
 * By doing so, we can ensure that implementing classes only need to be concerned about the methods
 * that are of interest to them.
 *  “Clients should not be forced to implement unnecessary methods which they will not use”
 *
 * Which means, Instead of one fat interface many small interfaces are preferred based on groups
 * of methods with each one serving one submodule.
 * The goal of the interface segregation principle is similar to the single responsibility principle.
 * ISP is applicable to interfaces as a single responsibility principle holds to classes.
 *
 */

/***
 * Take an example. Developer Alex created an interface Reportable and added two methods
 * generateExcel() and generatedPdf().
 *
 * Now client ‘A’ wants to use this interface but he intends to use reports only in PDF format
 * and not in excel. Will he be able to use the functionality easily?
 * NO. He will have to implement both the methods, out of which one is an extra burden put on him
 * by the designer of the software. Either he will implement another method or leave it blank.
 *
 * This is not a good design. So what is the solution? Solution is to create two interfaces by
 * breaking the existing one. They should be like PdfReportable and ExcelReportable.
 *
 * This will give the flexibility to users to use only the required functionality only.
 *
 */
public interface ReportGenerator_With_Problem {

    public void generateExcelReport();

    public void generatePdfReport();

    public void generateHTMLReport();


}

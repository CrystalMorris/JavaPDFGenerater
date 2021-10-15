package com.itextpdf.pdfGenerator;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class HelloPDF {
    public static final String DEST = "results/helloPDF.pdf";

    public static void main(String[] args) throws IOException{
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new HelloPDF().createPdf(DEST);
    }

    public void createPdf(String destination) throws IOException{
        //INITIALIZE PDF WRITER
        FileOutputStream fos = new FileOutputStream(destination);
        PdfWriter writer = new PdfWriter(fos);

        //Initialize PDF Document
        PdfDocument pdf = new PdfDocument(writer);

        //Initialize document
        Document document = new Document(pdf);

        //Add paragraph to the content
        document.add(new Paragraph("Hello PDF!"));

        //Close document
        document.close();


    }
}

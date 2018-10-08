package funciones;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Hay que descargar la librería iText
 * @author Fer
 */
public class CrearPDF {

    public static void main(String[] a3d) throws FileNotFoundException, DocumentException{
        FileOutputStream archivo = new FileOutputStream("C:\\Documento1.pdf");
        Document documento = new Document();
        PdfWriter.getInstance(documento, archivo);
        documento.open();
        documento.add(new Paragraph(""));
        documento.add(new Paragraph(""));
        documento.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.mavenproject3.data;

import com.innnovacis.mavenproject3.model.Archivo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
/**
 *
 * @author innnovacis
 */
public class ArchivoRepository {
    private static final String SAVE_FOLDER = "/home/will/Download/Server/";
    
    @Inject
    private Logger log;
    @Inject
    private EntityManager em;
    
    @Inject
    private Event<Archivo> archivoEventSrc;
    
    Archivo archivo;
    
    
//    public String Upload(InputStream uploadedInputStream,
//			FormDataContentDisposition fileDetail)  
//    {
//        
//        String FileLocation = SAVE_FOLDER + fileDetail.getFileName();
//        try {
//            saveToFile(uploadedInputStream, FileLocation);
//            } catch (IOException e) {
//                    return "Error al guardar";
//            }
//	return "success";
//                // para guardar los datos y el archivo en la base de datos
//        
//    }
    
    
    private void saveToFile(InputStream inStream, String target) throws IOException {
		OutputStream out = null;
		int read = 0;
		byte[] bytes = new byte[1024];
		out = new FileOutputStream(new File(target));
		while ((read = inStream.read(bytes)) != -1) {
			out.write(bytes, 0, read);
		}
		out.flush();
		out.close();
    }
    public int Download(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}

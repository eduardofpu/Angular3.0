package org.wpattern.mutrack.simple.fileupload;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//para buscar o nome da imagem
public interface FileUploadRepository extends JpaRepository<FileUpload, Long>{
	
	//public FileUpload findByImage(String nomeimage);
	
	@Query("select u from FileUpload u where u.image  like ? ")
	public FileUpload findByImage(String nomeimage);
	
	

	//public FileUpload findByImageContaining(String image);
	
	public List<FileUpload> findByImageContaining(String image);
	
	
}

package org.wpattern.mutrack.simple.fileupload;

import org.wpattern.mutrack.simple.utils.BaseBean;

public class BuscarImagem extends BaseBean{
	
	// Para buscar o nome da imagem
	
	private static final long serialVersionUID = 1L;
	String image;
	public BuscarImagem(){
		
	}
	public BuscarImagem(String image) {
		super();
		this.image = image;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	

}

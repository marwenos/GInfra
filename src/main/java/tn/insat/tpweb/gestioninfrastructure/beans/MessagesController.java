package tn.insat.tpweb.gestioninfrastructure.beans;

import javax.faces.event.ActionEvent;  
import javax.faces.context.FacesContext;  
import javax.faces.application.FacesMessage;
  
public class MessagesController {  
  
    public void addInfo(ActionEvent actionEvent) { 
    	System.out.println("testButtonActionListener invoked");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Sample info message", "!"));  
    }  
  
    public void addWarn(ActionEvent actionEvent) {  
    	System.out.println("testButtonActionListener invoked");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Sample warn message", "!"));  
    }  
  
    public void addError(ActionEvent actionEvent) { 
    	System.out.println("testButtonActionListener invoked");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Sample error message", ""));  
    }  
  
    public void addFatal(ActionEvent actionEvent) { 
    	System.out.println("testButtonActionListener invoked");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Sample fatal message", ""));  
    }  
}

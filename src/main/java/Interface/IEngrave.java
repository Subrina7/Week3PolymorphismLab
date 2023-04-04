package Interface;

public interface IEngrave {

    default String addEngraving(String yourName){
        return "Engraving added for " + yourName;
    }


}

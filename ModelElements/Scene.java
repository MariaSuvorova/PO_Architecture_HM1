package ModelElements;

import java.util.List;

public class Scene{
    public int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(int id, List<PoligonalModel> models,
        List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        this.Flashes = flashes;
        if(Models.size()>0){
            this.Models = models;
        }
        else{
            throw new Exception("Must be at least 1 Model");
        }
        if(Cameras.size()>0){
            this.Cameras = cameras;
        }
        else{
            throw new Exception("Must be at least 1 Camera");
        }

        public Type method1(Type type){
            return result;
        }
        public Type method2(Type type1, Type type2){
            return result;
        }

    }

    

}
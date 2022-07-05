package com.example.design.pattern.creational.simplefactory;

public class VideoFactory {

    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }




    //v1
//    public Video getVideo(String type){
//        if ("java".equals(type)){
//            return new JavaVideo();
//        } else if ("python".equals(type)){
//            return new PythonVideo();
//        }
//        return null;
//    }
}

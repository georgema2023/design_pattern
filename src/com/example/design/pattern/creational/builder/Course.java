package com.example.design.pattern.creational.builder;

public class Course {
    private String courseName;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    private Course(CourseBuilder builder){
        this.courseName = builder.courseName;
        this.courseVideo = builder.courseVideo;
        this.courseArticle = builder.courseArticle;
        this.courseQA = builder.courseQA;
    }

    public static class CourseBuilder{
        private String courseName;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public CourseBuilder buildCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }


        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }


        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}

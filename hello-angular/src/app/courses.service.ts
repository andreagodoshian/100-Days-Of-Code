// @Component() <-- no @Service, like in Spring Boot

export class CoursesService {

    getCourses() {
        return ['course1', 'course2', 'course3', 'course4'];
    }
    // ^^^ NOTE: this is hard-coded bc I'm a noob
    // ...there is no http logic yet

}
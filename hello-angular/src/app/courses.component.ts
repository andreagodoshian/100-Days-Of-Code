import { Component } from "@angular/core";

@Component({ // "decorator"
    selector: 'courses', // <courses>
    // ".courses" for <div class="courses"
    // "#courses" for <div id="courses">

    // SO!! Anytime we have <courses>, 
    // the template will render
    template: '<h2>Courses</h2>' 
}) 
// NOTE: in reality, template may be a separate file


// go to app.module.ts, then app.component.html
export class CoursesComponent { // pascal naming convention?

}
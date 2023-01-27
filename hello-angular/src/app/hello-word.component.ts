import { Component } from "@angular/core";

@Component({
    selector: 'hello-angular',
    template: '',
    styles: [`
    h1 {
        color: blue;
    }`]
})

export class HelloWorldComponent {
    title = "Hello World"
}
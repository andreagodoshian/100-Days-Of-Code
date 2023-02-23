<script setup>
import { ref } from "vue";

const showModal = ref(false); // boolean click event
const newNote = ref("H-h-h hewwo?"); // v-model
const allNotes = ref([]);

const getRandomColor = () => {
  return "hsl(" + Math.random() * 360 + ", 100%, 75%";
}

const addNoteHandler = () => {
  allNotes.value.push({
    id: Math.floor(Math.random() * 100000),
    text: newNote.value,
    date: new Date(),
    backgroundColor: getRandomColor()
  });
  showModal.value = false; // close the modal, easy-peasy :)
  newNote.value = "H-h-h hewwo?";
}
</script>

<!-- Note: screen readers are another v-if vs. v-show -->

<template>
  <main>
    <div v-if="showModal" class="overlay">
      <div class="modal">
        <textarea
          v-model="newNote"
          name="note"
          id="note"
          cols="30"
          rows="10"
        ></textarea>
        <button @click="addNoteHandler">Add Note</button>
        <button @click="showModal = false" class="close">Close</button>
      </div>
    </div>
    <div class="container">
      <header>
        <h1>Notes</h1>
        <p>{{ allNotes }}</p>
        <button @click="showModal = true">+</button>
      </header>
      <div class="cards-container">
        <div class="card">
          <p class="main-text">
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Consequatur
            laboriosam optio id esse voluptatum sint.
          </p>
          <p class="date">02/22/2023</p>
        </div>
      </div>
    </div>
  </main>
</template>

<style scoped>
* {
  font-family: "Courier New", Courier, monospace;
}

main {
  height: 100vh;
  width: 100vw;
}

.overlay {
  position: absolute;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.5);
  z-index: 10;
  display: flex;
  align-items: center;
  justify-content: center;
}

.modal {
  width: 75%;
  background-color: white;
  padding: 1.5rem;
  position: relative;
  display: flex;
  flex-direction: column;
}

.modal button {
  padding: 0.75rem;
  font-size: 1rem;
  width: 100%;
  background-color: black;
  color: white;
  cursor: pointer;
}

.modal .close {
  background-color: red;
  margin-top: 0.25rem;
}

.container {
  max-width: 90%;
  padding: 1rem;
  margin: 0 auto;
}

header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

h1 {
  font-weight: bold;
  font-size: 5rem;
}

header button {
  border: none;
  width: 3rem;
  height: 3rem;
  border-radius: 100%;
  background-color: black;
  color: white;
  cursor: pointer;
}

.card-container {
  display: flex;
  flex-wrap: wrap;
}
.card {
  width: 25vw;
  height: 25vh;
  background-color: aquamarine;
  padding: 1.5rem;
  border-radius: 15px;
  flex-direction: column;
  justify-content: space-between;
}

.date {
  font-size: 0.75rem;
  font-weight: bold;
}
</style>

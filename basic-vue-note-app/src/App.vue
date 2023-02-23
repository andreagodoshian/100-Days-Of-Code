<script setup>
import { ref } from "vue";

const showModal = ref(false); // boolean click event
const newNote = ref("H-hewwo?"); // v-model
const errorMessage = ref("") // empty string == false
const allNotes = ref([]);

const getRandomColor = () => {
  return "hsl(" + Math.random() * 360 + ", 100%, 75%";
};

const addNoteHandler = () => {
  if (newNote.value.trim.length <= 10) {

    alert("Note must be >= 10 characters.")
    return errorMessage.value="Note must be >= 10 characters."
  }
  allNotes.value.push({
    id: Math.floor(Math.random() * 100000),
    text: newNote.value,
    date: new Date(),
    backgroundColor: getRandomColor(),
  });
  showModal.value = false; // close the modal, easy-peasy :)
  newNote.value = "H-hewwo?"; // reset
  errorMessage.value = ""; // reset
};

const closeModal = () => {
  errorMessage.value = "";
  showModal.value = false;
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
        <p v-if="errorMessage" style="color: red;">{{ errorMessage }}</p>
        <button @click="addNoteHandler">Add Note</button>
        <button @click="closeModal" class="close">Close</button>
      </div>
    </div>
    <div class="container">
      <header>
        <h1>Notes</h1>
        <button @click="showModal = true">+</button>
      </header>
      <div class="cards-container">
        <div
          v-for="x in allNotes"
          :key="x.id"
          class="card"
          :style="{ backgroundColor: x.backgroundColor }"
        >
          <p class="main-text">
            {{ x.text }}
          </p>
          <p class="date">{{ x.date.toLocaleDateString("en-US") }}</p>
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
  margin: 0.5rem;
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

.cards-container {
  display: flex;
  flex-wrap: wrap;
}
.card {
  width: 30vw;
  height: 30vh;
  background-color: aquamarine;
  padding: 1.5rem;
  margin: 0.5rem;
  border-radius: 15px;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}

.main-text {
  font-size: .9rem;
  overflow: scroll;
}

.date {
  font-size: 0.75rem;
  font-weight: bold;
}
</style>

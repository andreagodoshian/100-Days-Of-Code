<template>
  <main>
    <div class="overlay">
      <div class="modal">
        <textarea name="note" id="note" cols="30" rows="10"></textarea>
        <button>Add Note</button>
        <button class="close">Close</button>
      </div>
    </div>
    <div class="container">
      <header>
        <h1>Notes</h1>
        <button>+</button>
      </header>
      <div class="cards-container">
        <div class="card">
          <p class="main-text">Lorem ipsum dolor sit amet consectetur adipisicing elit. Consequatur laboriosam optio id esse voluptatum sint.</p>
          <p class="date">02/22/2023</p>
        </div>
      </div>
    </div>
  </main>
</template>

<style scoped>
*{
  font-family: 'Courier New', Courier, monospace;
}

main {
  height: 100vh;
  width: 100vw;
}

.container {
  max-width: 90vw;
  padding: 1rem;
  margin: 0 auto;
}

.overlay {
  position: absolute;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, .50);
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
  padding: .75rem;
  font-size: 1rem;
  width: 100%;
  background-color: black;
  color: white;
  cursor: pointer;
}

.modal .close {
  background-color: red;
  margin-top: .25rem;
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
  padding: 1rem;
  border-radius: 15px;
  flex-direction: column;
  justify-content: space-between;
}

.date {
  font-size: .75rem;
  font-weight: bold;
}
</style>

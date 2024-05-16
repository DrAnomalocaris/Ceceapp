var clockVisible=true;

function toggleClock() {
    clockVisible = document.getElementById("clockCheckbox").checked;
    console.log(clockVisible)
}


const centerX = canvas.width / 2;
const centerY = canvas.height / 2;
const now = new Date();
const hours = now.getHours();
const minutes = now.getMinutes();
const seconds = now.getSeconds();
const formattedTime = `${hours.toString().padStart(2, '0')}:${minutes.toString().padStart(2, '0')}:${seconds.toString().padStart(2, '0')}`;

setInterval(() => {
  // Get the current time and format it
    ctx.font = '30px Arial';
    ctx.textAlign = 'center';
    ctx.textBaseline = 'middle';
    ctx.fillStyle = '#444444';
    ctx.fillText(formattedTime, centerX, centerY);
  // Clear the canvas
  //ctx.clearRect(0, 0, canvas.width, canvas.height);

  // Draw the time on the canvas
  ctx.fillText(formattedTime, centerX, centerY);
}, 1000);
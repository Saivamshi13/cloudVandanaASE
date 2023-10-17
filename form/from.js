function submitForm() {
  const form = document.getElementById("surveyForm");
  if (form.checkValidity()) {
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const gender = document.querySelectorAll("input[type=checkbox]:checked");
    const genderValues = Array.from(gender)
      .map((checkbox) => checkbox.value)
      .join(", ");
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;

    const popupContent = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${genderValues}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
      `;

    document.getElementById("popup-results").innerHTML = popupContent;
    openPopup();
    form.reset();
  } else {
    alert("Please fill out all required fields before submitting the form.");
  }
}

function resetForm() {
  const form = document.getElementById("surveyForm");
  form.reset();
}

function openPopup() {
  document.getElementById("popup").style.display = "block";
}

function closePopup() {
  document.getElementById("popup").style.display = "none";
}

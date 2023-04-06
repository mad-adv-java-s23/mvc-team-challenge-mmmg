<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>CSS Flexbox Responsive Forms</title>
    <link rel="stylesheet" type="text/css" href="styles/styles.css">
  </head>
  <body>
    <div class="container2">
    <header>
      <h1>Easter Raffle 2023</h1>
    </header>
    <main>
      <h2>Welcome Participant!</h2>
      <p>To get started, fill out the required form below,<br>
            and click on the 'submit' button to enter the raffle.<br>
            All raffle participants will have a prize selected<br>
            for them at random, chosen from a prize pool based<br>
            on their age range.</p>
      <div id="container">
        <div class="form-box">
          <form class="c-form" name="c-form" action="easterPrize" method="get" onSubmit="return submitForm(event);">
              <fieldset>
                <label class="c-form-label" for="last-name">Last name<span class="c-form-required"> *</span></label>
                <input id="last-name" class="c-form-input" type="text" name="your-last-name" placeholder="Your last name" required>
              </fieldset>

              <fieldset>
                <label class="c-form-label" for="first-name">First name<span class="c-form-required"> *</span></label>
                <input id="first-name" class="c-form-input" type="text" name="your-first-name" placeholder="Your first name" required>
              </fieldset>

            <fieldset>
              <label class="c-form-label" for="phone">Phone Number<span class="c-form-required"> *</span></label>
              <input id="phone" class="c-form-input" type="tel" name="your-phone-number" placeholder="999-999-9999" required>
            </fieldset>

            <fieldset>
              <label class="c-form-label" for="subject">Age<span class="c-form-required"> *</span></label>
              <input id="subject" class="c-form-input" type="number" name="your-age" placeholder="Enter age" required>
            </fieldset>

            <button class="c-form-btn" id="submit" type="submit">SUBMIT</button>
          </form>
        </div>
      </div>
    </main>
    <footer>
      <p>&copy; AdvJava, Team M3G group project.</p>
    </footer>
  </div>
  </body>
</html>
# Login-Signup-Android-Studio



This Android application allows users to sign up with a username and password, and then log in using the created credentials. Validation rules for the password are enforced during signup. Upon successful login, users are directed to a success page; otherwise, they receive an error message.

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/Android_Login_Signup.git
   ```

2. Open the project in Android Studio.

3. Run the application on an emulator or a physical device.

### Usage

1. **Sign Up**: Enter your email and password. Password must meet the following criteria:
   - Contains uppercase and lowercase letters.
   - Contains letters and numbers.
   - Contains special characters.
   - Minimum length of 8 characters.

2. **Login**: Use the email and password created during sign up to log in.
   - Users have only two attempts to log in.
   - After two failed attempts, the login button is disabled.

### Example

1. Sign Up:
   - Email: example@example.com
   - Password: Example@123

2. Login:
   - Email: example@example.com
   - Password: Example@123



### XML Files

- `main.xml`: Layout for the sign-up activity.
- `login.xml`: Layout for the login activity.
- `loginsuccess.xml`: Layout for the successful login activity.

### Java Files

- `MainActivity.java`: Handles the sign-up functionality.
- `loginActivity.java`: Manages the login process.
- `loginsuccessActivity.java`: Displays the success message after login.

### Requirements

- Android Studio
- Android SDK

### License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

package lk.ijse.gdse.aad.Api;

import lk.ijse.gdse.aad.Config.JwtUtil;
import lk.ijse.gdse.aad.Dto.AdminDTO;
import lk.ijse.gdse.aad.Dto.ErrorRes;
import lk.ijse.gdse.aad.Dto.LoginReq;
import lk.ijse.gdse.aad.Dto.LoginRes;
import lk.ijse.gdse.aad.Service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/login")
@CrossOrigin
public class AuthenticationApi {

    private final AuthenticationManager authenticationManager;
    @Autowired
    private AuthenticationService adminServiceImpl;
    private final JwtUtil jwtUtil;

    public AuthenticationApi(AuthenticationManager authenticationManager, JwtUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity login(@RequestBody LoginReq loginReq) {
        try {
            Authentication authentication =
                    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginReq.getEmail(), loginReq.getPassword()));
            String email = authentication.getName();
            AdminDTO user = adminServiceImpl.searchUser(email);
            String token = jwtUtil.createToken(user);
            LoginRes loginRes = new LoginRes(email, token);
            return ResponseEntity.ok(loginRes);

        }catch (BadCredentialsException e){
            ErrorRes errorResponse = new ErrorRes(HttpStatus.BAD_REQUEST,"Invalid username or password");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }catch (Exception e){
            ErrorRes errorResponse = new ErrorRes(HttpStatus.BAD_REQUEST, e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }

    @GetMapping("/{email}")
    public ResponseEntity getUser(@PathVariable String email){
        return ResponseEntity.ok(adminServiceImpl.searchUser(email));
    }
}
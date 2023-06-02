package com.host.file;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @PostMapping("/api/serve")
    private ResponseEntity<?> serve(@RequestParam(required = false) String name, @RequestBody MultipartFile file) throws IOException {
        String dir = System.getProperty("user.dir");
        Files.write(Path.of(dir + "/static/serve/" + (name != null ? name : file.getName())), file.getBytes());
        return ResponseEntity.ok().build();
    }
}

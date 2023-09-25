package pe.edu.upc.aww.takemehomes.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.takemehomes.dtos.NotificationDTO;
import pe.edu.upc.aww.takemehomes.entities.Notification;
import pe.edu.upc.aww.takemehomes.serviceinterfaces.INotificationService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private INotificationService nS;

    @PostMapping
    public void register(@RequestBody NotificationDTO dto) {

        ModelMapper m = new ModelMapper();
        Notification n = m.map(dto, Notification.class);
        nS.insert(n);
    }
    @GetMapping
    public List<NotificationDTO> listar() {
        return nS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, NotificationDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        nS.delete(id);
    }

    @GetMapping("/{id}")
    public NotificationDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        NotificationDTO dto = m.map(nS.listId(id), NotificationDTO.class);
        return dto;
    }

}

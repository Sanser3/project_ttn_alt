package dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AddTtnRequest {
    private String name;
    private List<Integer> order;
}

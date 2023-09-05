package controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import repository.IndexRepository;


import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j
@RequiredArgsConstructor
public class IndexController {

    private final ProductRepository productRepository;

    private final IndexRepository indexRepository;

    private final UserRespository userRespository;

    @GetMapping(value = "/")
    public String index(Model model, HttpServletRequest request) throws Exception{

        Map<String, Object> map = new HashMap();
        map.put("nowProductList", indexRepository.nowProductList());

        return "index";
    }
}

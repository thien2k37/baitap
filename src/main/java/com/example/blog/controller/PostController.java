package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/posts")
public class PostController {
    @GetMapping("")
    public ModelAndView add(){
        return new ModelAndView("/test");
    }
   /* @GetMapping("")
    public ModelAndView getHome(String findTitle, String likes, String newPost){
        ModelAndView modelAndView = new ModelAndView("/home");
        Iterable<Post> post = postService.findAll();
        if (findTitle != null) {
            post = postService.findAllByTitleContaining(findTitle);
        }
        if (likes != null) {
            post = postService.findAllByLikes();
        }
        if (newPost != null) {
            post = postService.findTop4New();
        }
        modelAndView.addObject("post", post);
        return modelAndView;
    }
    @GetMapping("/add")
    public ModelAndView add(){
        ModelAndView modelAndView = new ModelAndView("/blog/test");
        return modelAndView;
    }
    @PostMapping("/add")
    public ModelAndView savePost(Post post) {
        postService.save(post);
        return new ModelAndView("redirect:/posts");
    }

    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("/edit");
        Post post = postService.findById(id).get();
        modelAndView.addObject("posts", post);
        return modelAndView;
    }
    @PostMapping("/{id}/edit")
    public ModelAndView update(@PathVariable long id, Post post) {
        ModelAndView modelAndView = new ModelAndView("redirect:/posts");
        postService.save(post);
        return modelAndView;
    }
    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/posts");
        postService.remove(id);
        return modelAndView;
    }*/
}
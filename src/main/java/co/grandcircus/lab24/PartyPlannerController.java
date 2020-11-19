package co.grandcircus.lab24;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PartyPlannerController {

	@Autowired
	private PartyRepository repo;
	@Autowired
	private PartyOptionRepository rep;
	
	@GetMapping("/")
	public String homepage(Model model) {
		List<Party> parties = repo.findAll();
		System.out.println(parties);
		model.addAttribute("parties",parties);
		return "homepage";
	}
	
	@GetMapping("/addvote/{id}")
	public String addVote(@PathVariable Long id) {
		int votes;
		
		PartyOption partyoption = rep.findById(id).get();
		votes = partyoption.getVotes() + 1;
		partyoption.setVotes(votes);
		rep.save(partyoption);
		System.out.println(partyoption.getVotes());
		
		return "redirect:/vote";
	}
	
	@GetMapping("/vote")
	public String vote(Model model) {
		List<PartyOption> partyoptions = rep.findAll();
		model.addAttribute("partyoptions",partyoptions);
		return "vote";
	}
	
	@GetMapping("/review")
	public String review(Model model) {
		List<PartyOption> partyoptions = rep.findByVotes(0);
		model.addAttribute("partyoptions",partyoptions);
		return "review";
	}
	
	@PostMapping("/newpizza")
	public String newPizza(PartyOption partyoption, Model model) {
		System.out.println("NEWPIZZA");
		System.out.println(partyoption);
		//partyoption.setVotes(0);
		
		System.out.println(partyoption.getId());
		System.out.println("1");
		
		rep.save(partyoption);
		
		System.out.println("2");
		model.addAttribute("partyoption",partyoption);
		System.out.println("3");
		List<PartyOption> partyoptions = rep.findAll();
		System.out.println("4");
		model.addAttribute("partyoptions",partyoptions);
		System.out.println("5");
				
		return "redirect:/vote";
	}
}

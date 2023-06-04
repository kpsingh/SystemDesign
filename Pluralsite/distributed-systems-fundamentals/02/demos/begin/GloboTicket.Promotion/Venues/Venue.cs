﻿using System.ComponentModel.DataAnnotations;

namespace GloboTicket.Promotion.Venues
{
    public class Venue
    {
        public int VenueId { get; set; }

        [MaxLength(50)]
        [Required]
        public string Name { get; set; }
        [MaxLength(50)]
        [Required]
        public string City { get; set; }
    }
}
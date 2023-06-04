﻿using GloboTicket.Promotion.Data;
using GloboTicket.Promotion.Messages.Acts;
using MassTransit;
using System.Threading.Tasks;

namespace GloboTicket.Promotion.Acts
{
    class ActDescriptionNotifier : INotifier<ActDescription>
    {
        private readonly IPublishEndpoint publishEndpoint;

        public ActDescriptionNotifier(IPublishEndpoint publishEndpoint)
        {
            this.publishEndpoint = publishEndpoint;
        }

        public async Task Notify(ActDescription actDescription)
        {
            var actDescriptionChanged = new ActDescriptionChanged
            {
                actGuid = actDescription.Act.ActGuid,
                description = new ActDescriptionRepresentation
                {
                    title = actDescription.Title,
                    imageHash = actDescription.ImageHash,
                    modifiedDate = actDescription.ModifiedDate
                }
            };

            await publishEndpoint.Publish(actDescriptionChanged);
        }
    }
}